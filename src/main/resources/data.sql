CREATE TABLE IF NOT EXISTS caixa (
  id INT PRIMARY KEY,
  debito int,
  credito int,
  documento varchar,
  descricao varchar
);

INSERT INTO caixa (id, debito, credito,documento,descricao) VALUES
  (1, 300,400,'10436248000153', 'Cafe Roma'),
  (2, 3000,480,'10436248000153', 'Emporio Rueda');
