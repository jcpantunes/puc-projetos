Alterações para tomcat:

(1) WEB.XML

 -> Adicionar as linhas abaixo em: /src/main/webapp/WEB-INF/web.xml

<listener>
   <listener-class>org.jboss.weld.environment.servlet.Listener</listener-class>
</listener>

(2) Agora é necessário informar que você não quer usar uma persistência usando JTA. 
Isto, porque você não está em um servidor JEE, mas em um container web. 
Verifique se seu arquivo persistence.xml não tem uma entrada do tipo <jta-data-source>java:/DefaultDS</jta-data-source>. 
Caso tenha, remova e deixe parecido com o arquivo abaixo.

<persistence-unit name="bookmark-ds" transaction-type="RESOURCE_LOCAL">
   <class>br.gov.serpro.exemplo.domain.Bookmark</class>
   <properties>
      <property name=”javax.persistence.jdbc.driver” value=”org.hsqldb.jdbcDriver” />
      <property name=”javax.persistence.jdbc.user” value=”sa” />
      <property name=”javax.persistence.jdbc.password” value=”" />
      <property name=”javax.persistence.jdbc.url” value=”jdbc:hsqldb:hsql:.” />
      <property name=”eclipselink.logging.level” value=”FINE” />
      <property name=”eclipselink.ddl-generation” value=”create-tables” />
      <property name=”eclipselink.ddl-generation.output-mode” value=”database” />
   </properties>
</persistence-unit>

(3) Verifique seu arquivo beans.xml, que você deve encontrar em /src/main/resources/META-INF. 
Certifique-se de não ter como alternativa para a transação a classe JTATransaction. Caso sim, apague e deixe como descrito a seguir:

<alternatives>
   <class>br.gov.frameworkdemoiselle.transaction.JPATransaction</class>
</alternatives>

(4). Ativar o Profile do Tomcat 7

 Para isto, no caso de você estar usando o Eclipse, selecione o projeto na aba de Package Explorer. 
 Clique com o botão direito do mouse e selecione Propriedades. Selecione a opção Maven. 
 Na direita, você deve ver uma opção chamada Active Maven Profiles. 
 Digite “tomcat7″ na caixa de texto e clique em Apply.
 
 
 