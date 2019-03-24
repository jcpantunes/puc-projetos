/*
CREATE TABLE public."Funcionario"
(
  "idFuncionario" integer NOT NULL DEFAULT nextval('"Funcionario_idFuncionario_seq"'::regclass),
  "nmFuncionario" character(80),
  "matFuncionario" character(10),
  CONSTRAINT "PKIdFuncionario" PRIMARY KEY ("idFuncionario")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Funcionario"
  OWNER TO postgres;
  
*/

/*CREATE TABLE public."Tarefa"
(
  "idTarefa" integer NOT NULL DEFAULT nextval('"Tarefa_idTarefa_seq"'::regclass),
  "titulo" character(100),
  "dtTarefa" timestamp without time zone,
  "idFuncionario" integer NOT NULL,
  CONSTRAINT "PKIdTarefa" PRIMARY KEY ("idTarefa")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Tarefa"
  OWNER TO postgres;
*/


-- INSERT INTO public."Funcionario"("nmFuncionario", "matFuncionario") VALUES ('Julio', '21084505');


-- INSERT INTO public."Tarefa"("titulo", "dtTarefa", "idFuncionario") VALUES ('Cadastrar Funcionario', '2019-03-13', 1);






