create table uf(
cd_uf integer not null,
nm_uf varchar(50),

constraint pk_UF primary key(cd_uf)
);
 
create table cidade(
cd_cidade integer not null, 
nm_cidade varchar(50),
cd_uf integer not null,
constraint pk_cidade primary key (cd_cidade),
constraint fk_uf foreign key(cd_uf) references uf(cd_uf)
);

CREATE TABLE ENDERECO(
cd_endereco integer not null,
cd_cidade integer not null,

constraint pk_endereco primary key(cd_endereco),
constraint fk_cidade foreign key (cd_cidade) references cidade(cd_cidade)
);

create table cliente(
cd_Cliente integer not null,
cd_endereco integer not null,
rg char(11),
cpf char(11),
nm_cliente varchar(100),
tel_cliente char(11),

constraint pk_cliente primary key (cd_Cliente),
constraint fk_endereco foreign key (cd_endereco) references endereco(cd_endereco),
constraint un_rg unique(rg),
constraint un_cpf unique (cpf)
);

create table tp_cartao(
cd_tp_cartao integer not null, 
tipo varchar(20),

constraint pk_tp_cartao primary key (cd_tp_Cartao)
);

create table operadora_cartao (
cd_operadora integer not null,
nm_operadora varchar(40),

constraint pk_operadora primary key (cd_operadora)
);

create table banco(
cd_banco integer not null, 
nome_banco varchar (40),

constraint pk_banco primary key (cd_banco)
);

create table agencia (
cd_agencia integer not null,
cd_banco integer not null,
cd_endereco_agencia integer not null,
nm_agencia varchar(100),
tel_agencia char(11),

constraint pk_agencia primary key (cd_Agencia, cd_Banco),
constraint fk_Banco foreign key (cd_banco) references banco(cd_banco),
constraint fk_endereco_agencia foreign key (cd_endereco_Agencia) references endereco(cd_endereco)
);

create table conta (
cd_conta integer not null,
cd_banco integer not null,
cd_agencia integer not null,
vl_sd_corrente number(12,2),
vl_sd_poupanca number(12,2),
cd_senha number(6),

constraint pk_conta primary key (cd_conta),
constraint fk_agencia foreign key (cd_Agencia, cd_banco) references agencia(cd_agencia,cd_banco)
);

create table conta_cliente(
cd_cliente integer not null,
cd_conta integer not null,

constraint pk_conta_cliente primary key (cd_cliente, cd_conta),
constraint fk_cliente foreign key (cd_cliente) references cliente(cd_cliente),
constraint fk_conta foreign key (cd_Conta) references conta(cd_conta)
);

create table cartao (
cd_Cartao integer  not null,
tp_cartao integer not null,
conta integer not null,
operadora integer not null,
dt_val date,
dt_esp date,
cd_senha number(6),

constraint pk_cartao primary key (cd_Cartao),
constraint fk_tp_cartao foreign key (tp_cartao) references tp_Cartao(cd_tp_cartao),
constraint fk_conta_cartao foreign key (conta) references conta(cd_Conta),
constraint fk_operadora_cartao foreign key (operadora) references operadora_cartao(Cd_operadora)

);

create table saque(
cd_saque integer not null,
vl_saque number (12,2),

constraint pk_saque primary key (cd_saque)

);

create table pagamento (
cd_pagamento integer not null,
cd_conta integer not null,
cod_barra char(48),

constraint pk_pagamento primary key (cd_pagamento),
constraint fk_conta_pagamento foreign key (cd_conta) references conta(cd_conta)
);

create table sessao(
cd_sessao integer not null,
cd_conta integer not null,
dt_sessao date,

constraint pk_sessao primary key (cd_sessao),
constraint fk_conta_sessao foreign key (cd_conta) references conta(cd_conta)
);

create table transferencia (
cd_trans integer not null,
conta_origem integer,
conta_destino integer,
valor_trans number(12,2),

constraint pk_trans primary key (cd_trans),
constraint fk_conta_origem foreign key (conta_origem) references conta(cd_conta),
constraint fk_conta_destino foreign key (conta_destino) references conta(cd_conta)

);

create table operacao(
cd_operacao integer not null,
cd_conta_sessao integer,
cd_sessao integer,
cd_trans integer,
cd_saque integer,
cd_pagamento integer,
dt_operacao date,
cd_op_ct integer,

constraint pk_operacao primary key (cd_operacao),
constraint fk_cont_operacao foreign key (cd_sessao) references sessao(cd_sessao),
constraint fk_trans_op foreign key (cd_trans) references transferencia(cd_trans),
constraint fk_saque_op  foreign key (cd_saque) references saque(cd_saque),
constraint fk_pagamento_op foreign key (cd_pagamento) references pagamento(cd_pagamento)
);

create table movimentacao (
cd_mov integer not null,
cd_operacao integer,
ds_mov varchar (50),
vl_mov number(12,2),

constraint pk_mov primary key (cd_mov),
constraint fk_operacao foreign key (cd_operacao) references operacao(cd_operacao)
);

create table saldo(
cd_saldo integer not null,
cd_conta integer not null, 
cd_mov integer,
dt_saldo date,
vl_saldo number (12,2),

constraint pk_saldo primary key (cd_saldo, cd_conta),
constraint fk_conta_saldo foreign key (cd_conta) references conta(cd_conta),
constraint fk_mov foreign key (cd_mov) references movimentacao(cd_mov));

--ALTERAÇÕES DE COLUNAS NAS TABELAS CLIENTE, AGENCIA 28/04/2016 BRUNO S PICININI


ALTER TABLE CLIENTE MODIFY RG NUMBER(9);
ALTER TABLE CLIENTE MODIFY CPF NUMBER(11);
ALTER TABLE CLIENTE MODIFY TEL_CLIENTE NUMBER(11);

ALTER TABLE AGENCIA MODIFY TEL_AGENCIA NUMBER(11);

ALTER TABLE UF DROP COLUMN NM_UF;
ALTER TABLE UF ADD DS_SIGLA CHAR(2);

-- ADD COLUNAS ENDERECO 28/04/2016 BRUNO S PICININI

alter table endereco add logradouro varchar(30);
alter table endereco add nm_end number;
alter table endereco add comp varchar (30);
alter table endereco add bairro varchar (30);
alter table endereco add cep number (8);

cl screen;

desc endereco;