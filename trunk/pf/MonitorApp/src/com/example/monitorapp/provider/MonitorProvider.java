package com.example.monitorapp.provider;

import java.util.HashMap;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.provider.BaseColumns;

public class MonitorProvider  extends ContentProvider {

	public static final String MODULO = "monitor";
	
	public static final String AUTHORITY = "com.example.monitorapp.provider.monitorprovider";
	
	public static final Uri URI = Uri.parse("content://" + AUTHORITY);

	// Nome do arquivo que irá conter o banco de dados.
	private static final String DATABASE_NAME = MODULO + ".db";

	// Versao do banco de dados.
	// Este valor é importante pois é usado em futuros updates do DB.
	private static final int DATABASE_VERSION = 1;

	// Nome da tabela que irá conter as anotações.
	private static final String EXCECAO_TABLE = "excecao";

	// 'Id' da Uri referente às notas do usuário.
	private static final int EXCECAO = 1;

	// Tag usada para imprimir os logs.
	public static final String TAG = MODULO + "Provider";

	private SQLiteOpenHelper mHelper;

	private static HashMap<String, String> mProjection;
	static {
		mProjection = new HashMap<String, String>();
		mProjection.put(Excecao.EXCECAO_ID, Excecao.EXCECAO_ID);
		mProjection.put(Excecao.EXCECAO_DATA, Excecao.EXCECAO_DATA);
		mProjection.put(Excecao.EXCECAO_TIPO, Excecao.EXCECAO_TIPO);
	}

	// Uri matcher - usado para extrair informações das Uris
	private static final UriMatcher mMatcher;
	static {
		mMatcher = new UriMatcher(UriMatcher.NO_MATCH);
		mMatcher.addURI(AUTHORITY, EXCECAO_TABLE, EXCECAO);
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		SQLiteDatabase db = mHelper.getWritableDatabase();
		int count;
		switch (mMatcher.match(uri)) {
		case EXCECAO:
			count = db.delete(EXCECAO_TABLE, selection, selectionArgs);
			break;
		default:
			throw new IllegalArgumentException("URI desconhecida " + uri);
		}

		getContext().getContentResolver().notifyChange(uri, null);
		return count;
	}

	@Override
	public String getType(Uri uri) {
		switch (mMatcher.match(uri)) {
		case EXCECAO:
			return Excecao.CONTENT_TYPE;
		default:
			throw new IllegalArgumentException("URI desconhecida " + uri);
		}
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		switch (mMatcher.match(uri)) {
		case EXCECAO:
			SQLiteDatabase db = mHelper.getWritableDatabase();
			long rowId = db.insert(EXCECAO_TABLE, Excecao.EXCECAO_DATA, values);
			if (rowId > 0) {
				Uri noteUri = ContentUris.withAppendedId(Excecao.CONTENT_URI, rowId);
				getContext().getContentResolver().notifyChange(noteUri, null);
				return noteUri;
			}
		default:
			throw new IllegalArgumentException("URI desconhecida " + uri);
		}
	}

	@Override
	public boolean onCreate() {
		mHelper = new DBHelper(getContext());
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {

		SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
		SQLiteDatabase database = mHelper.getReadableDatabase();
		Cursor cursor;
		switch (mMatcher.match(uri)) {
			case EXCECAO:
				builder.setTables(EXCECAO_TABLE);
				builder.setProjectionMap(mProjection);
				break;
	
			default:
				throw new IllegalArgumentException("URI desconhecida " + uri);
		}

		cursor = builder.query(database, projection, selection, selectionArgs, null, null, sortOrder);
		cursor.setNotificationUri(getContext().getContentResolver(), uri);
		return cursor;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
		SQLiteDatabase db = mHelper.getWritableDatabase();
		int count;
		switch (mMatcher.match(uri)) {
			case EXCECAO:
				count = db.update(EXCECAO_TABLE, values, selection, selectionArgs);
				break;
			default:
				throw new IllegalArgumentException("URI desconhecida " + uri);
		}

		getContext().getContentResolver().notifyChange(uri, null);
		return count;
	}

	/**
	 * Inner Classes utilitárias
	 *
	 */
	public static final class Excecao implements BaseColumns {
		public static final Uri CONTENT_URI = Uri.parse("content://"
				+ MonitorProvider.AUTHORITY + "/" + EXCECAO_TABLE);

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/"
				+ MonitorProvider.AUTHORITY;

		public static final String EXCECAO_ID = "_id";
		
		public static final String EXCECAO_DATA = "_data";

		public static final String EXCECAO_TIPO = "_tipo";
	}

	private static class DBHelper extends SQLiteOpenHelper {

		DBHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		/*
		 * O método onCreate é chamado quando o provider é executado pela
		 * primeira vez, e usado para criar as tabelas no database
		 */
		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE " + EXCECAO_TABLE + 
					" (" + Excecao.EXCECAO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ Excecao.EXCECAO_DATA	+ " TEXT,"
					+ Excecao.EXCECAO_TIPO	+ " LONGTEXT );");
		}

		/*
		 * Esse método é invocado quando a versão do banco de dados muda.
		 * Assim, é usado para fazer adequações para a aplicação funcionar corretamente.
		 */
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// Como ainda estamos na primeira versão do DB,
			// não precisamos nos preocupar com o update agora.
		}
	}
}