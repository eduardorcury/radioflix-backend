CREATE TABLE categoria
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    titulo    VARCHAR(80)  NOT NULL,
    cor       VARCHAR(80)  NOT NULL,
    descricao VARCHAR(600) NOT NULL
);

CREATE TABLE video
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    titulo       VARCHAR(80)  NOT NULL,
    url          VARCHAR(255) NOT NULL,
    categoria_id INT REFERENCES categoria (id)
);