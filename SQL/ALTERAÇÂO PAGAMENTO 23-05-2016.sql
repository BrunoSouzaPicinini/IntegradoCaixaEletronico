--altera��o pagamento Bruno S. Picinini 23-05-2016

ALTER TABLE pagamento MODIFY CD_CONTA NUMBER NULL;

ALTER TABLE PAGAMENTO MODIFY COD_BARRA VARCHAR(48);
desc pagamento;

/*TESTE
insert INTO pagamento (CD_PAGAMENTO,CD_CONTA,CD_AGENCIA,CD_BANCO,COD_BARRA) values (1,1,1,1,'121212121212121212121212121212121212121212121212');  

SELECT cod_barra FROM PAGAMENTO;
delete from pagamento;
commit;
*/
