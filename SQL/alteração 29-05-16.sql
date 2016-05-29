desc mov_conta;
delete from mov_conta;
delete from MOVIMENTACAO;
delete from operacao;
delete from pagamento;
commit;
cl screen;
alter table mov_conta DROP COLUMN vl_saldo;
ALTER TABLE MOV_CONTA ADD vl_saldo_antigo number;
ALTER TABLE MOV_CONTA ADD vl_saldo_novo number;

desc TRANSFERENCIA;