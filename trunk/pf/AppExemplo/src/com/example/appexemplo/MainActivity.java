package com.example.appexemplo;

import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

import com.example.appexemplo.provider.QuickNotesProvider;

/**
 * http://www.felipesilveira.com.br/desenvolvendo-para-android/
 * 
 * @author 05163217658
 * 
 */
public class MainActivity extends ListActivity {

	private Cursor mCursor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// setContentView(R.layout.activity_main);
		// setContentView(R.layout.fragment_main);
		// configurarBotaoSortear();

		setContentView(R.layout.listar_erros);
		
		addNote("Teste1");
		addNote("Teste2");
		addNote("Teste3");

		Log.i("Welcome", "Iniciando tela Welcome ...");
		Intent i = new Intent(this, WelcomeActivity.class);
		startActivity(i);

		Button insertButton = (Button) findViewById(R.id.insert_button);
		insertButton.setOnClickListener(mInsertListener);

		// adicionando um 'Hint' ao Editbox.
		EditText editBox = (EditText) findViewById(R.id.edit_box);
		editBox.setHint("Nova nota...");

		mCursor = this.getContentResolver().query(
				QuickNotesProvider.Notes.CONTENT_URI, null, null, null, null);

		ListAdapter adapter = new SimpleCursorAdapter(
		// O primeiro parametro eh o context.
				this,
				// O segundo, o layout de cada item.
				R.layout.list_item,
				// O terceiro parametro eh o cursor que contem os dados
				// a serem mostrados
				mCursor,
				// o quarto parametro eh um array com as colunas do
				// cursor que serao mostradas
				new String[] { QuickNotesProvider.Notes.TEXT },
				// o quinto parametro eh um array (com o mesmo
				// tamanho do anterior) com os elementos que
				// receberao os dados.
				new int[] { R.id.text });

		setListAdapter(adapter);

	}

	// Definindo um OnClickListener para o botão "Inserir"
	private OnClickListener mInsertListener = new OnClickListener() {
		public void onClick(View v) {
			EditText editBox = (EditText) findViewById(R.id.edit_box);
			addNote(editBox.getText().toString());
			editBox.setText("");
		}
	};

	/*
	 * Método responsável por inserir um registro no content provider
	 */
	protected void addNote(String text) {
		ContentValues values = new ContentValues();
		values.put(QuickNotesProvider.Notes.TEXT, text);

		getContentResolver().insert(QuickNotesProvider.Notes.CONTENT_URI, values);
	}
}
