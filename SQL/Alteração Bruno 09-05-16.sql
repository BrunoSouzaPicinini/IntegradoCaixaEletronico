--ALTERAÇÕES SQL BRUNO 09-05-2016
DROP TABLE SALDO;

DELETE FROM CONTA_CLIENTE
WHERE CD_CLIENTE IN (1,2,3);

DELETE FROM CONTA
WHERE CD_CONTA IN (1,2,3);

alter table CONTA drop column CD_CONTA cascade constraints;


ALTER TABLE CONTA ADD( 
CD_CONTA NUMBER(6),
CONSTRAINT PK_CONTA PRIMARY KEY (CD_CONTA,CD_BANCO,CD_AGENCIA));

INSERT INTO CONTA (CD_CONTA,CD_BANCO,CD_AGENCIA,CD_SENHA,VL_SD_CORRENTE) VALUES(1,1,1,100000,50000);
INSERT INTO CONTA (CD_CONTA,CD_BANCO,CD_AGENCIA,CD_SENHA,VL_SD_CORRENTE) VALUES(2,1,1,200000,100000);
INSERT INTO CONTA (CD_CONTA,CD_BANCO,CD_AGENCIA,CD_SENHA,VL_SD_CORRENTE) VALUES(3,1,2,300000,150000);

--ADICIONAR FK OUTRAS TABELAS
ALTER TABLE CARTAO ADD(
CD_AGENCIA NUMBER,
CD_BANCO NUMBER
);

ALTER TABLE CARTAO
ADD CONSTRAINT FK_CONTA_CARTAO
FOREIGN KEY (CONTA,CD_AGENCIA,CD_BANCO)
REFERENCES CONTA (CD_CONTA,CD_AGENCIA,CD_BANCO);

UPDATE CARTAO SET CD_AGENCIA = 1 , CD_BANCO = 1 WHERE CD_CARTAO = 1;
UPDATE CARTAO SET CD_AGENCIA = 1 , CD_BANCO = 1 WHERE CD_CARTAO = 2;
UPDATE CARTAO SET CD_AGENCIA = 2 , CD_BANCO = 1 WHERE CD_CARTAO = 3;

ALTER TABLE CONTA_CLIENTE ADD(
CD_AGENCIA NUMBER,
CD_BANCO NUMBER);

ALTER TABLE CONTA_CLIENTE
ADD CONSTRAINT FK_CONTA_CC
FOREIGN KEY (CD_CONTA,CD_AGENCIA,CD_BANCO)
REFERENCES CONTA (CD_CONTA,CD_AGENCIA,CD_BANCO);

ALTER TABLE CONTA_CLIENTE DROP CONSTRAINT PK_CONTA_CLIENTE;

ALTER TABLE CONTA_CLIENTE ADD
CONSTRAINT PK_CONTA_CLIENTE PRIMARY KEY
(CD_CLIENTE,CD_CONTA,CD_AGENCIA,CD_BANCO);


INSERT INTO CONTA_CLIENTE VALUES(1,1,1,1);
INSERT INTO CONTA_CLIENTE VALUES(2,2,1,1);
INSERT INTO CONTA_CLIENTE VALUES(3,3,2,1);

CREATE TABLE MOV_CONTA(
CD_CONTA NUMBER,
CD_AGENCIA NUMBER,
CD_BANCO NUMBER,
CD_MOV NUMBER,
VL_SALDO NUMBER,
DT_MOV DATE,
CONSTRAINT PK_MOV_CONTA PRIMARY KEY (CD_CONTA,CD_AGENCIA,CD_BANCO,CD_MOV),
CONSTRAINT FK_CONTA_MC FOREIGN KEY (CD_CONTA,CD_AGENCIA,CD_BANCO) REFERENCES CONTA(CD_CONTA,CD_AGENCIA,CD_BANCO),
CONSTRAINT FK_MOV_MC FOREIGN KEY (CD_MOV) REFERENCES MOVIMENTACAO(CD_MOV));

ALTER TABLE SESSAO ADD(
CD_AGENCIA NUMBER,
CD_BANCO NUMBER,
CONSTRAINT FK_CONTA_SESSAO FOREIGN KEY (CD_CONTA,CD_AGENCIA,CD_BANCO) 
REFERENCES CONTA(CD_CONTA,CD_AGENCIA,CD_BANCO));

ALTER TABLE TRANSFERENCIA ADD(
AGENCIA_ORIG NUMBER,
BANCO_ORIG NUMBER,
AGENCIA_DEST NUMBER,
BANCO_DEST NUMBER,
CONSTRAINT FK_CONTA_TO FOREIGN KEY (CONTA_ORIGEM,AGENCIA_ORIG,BANCO_ORIG) REFERENCES CONTA (CD_CONTA,CD_AGENCIA,CD_BANCO),
CONSTRAINT FK_CONTA_TD FOREIGN KEY (CONTA_DESTINO,AGENCIA_DEST,BANCO_DEST) REFERENCES CONTA (CD_CONTA,CD_AGENCIA,CD_BANCO));

ALTER TABLE PAGAMENTO ADD(
CD_AGENCIA NUMBER,
CD_BANCO NUMBER,
CONSTRAINT FK_CONTA_PG FOREIGN KEY (CD_CONTA,CD_AGENCIA,CD_BANCO) REFERENCES CONTA(CD_CONTA,CD_AGENCIA,CD_BANCO));


COMMIT;