-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17/09/2025 às 15:23
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ecommerce`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(10) NOT NULL,
  `nome` char(50) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  `senha` char(15) DEFAULT NULL,
  `cpf` char(14) DEFAULT NULL,
  `endereco` char(100) DEFAULT NULL,
  `cidade` char(100) DEFAULT NULL,
  `estado` char(100) DEFAULT NULL,
  `cep` char(20) DEFAULT NULL,
  `dataCadastro` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `email`, `senha`, `cpf`, `endereco`, `cidade`, `estado`, `cep`, `dataCadastro`) VALUES
(1, 'Alibaba Sharid', 'alibabaexp@gmail.com', '32134921', '231.132.132-45', 'Rua da Qabba, 1243', 'Cabul', 'Cabul', '12345-678', '2025-09-17 09:25:00'),
(2, 'Mulan Hua', 'mulan.hua@gmail.com', 'password123', '432.231.213-54', 'Rua das Flores, 987', 'Xangai', 'Xangai', '98765-432', '2025-08-10 14:30:00'),
(3, 'Jamal Al-Farsi', 'jamal.af@gmail.com', 'securepass', '123.456.789-00', 'Av. das Palmeiras, 150', 'Mascate', 'Mascate', '11111-222', '2025-07-05 09:00:00'),
(4, 'Sofia Lopez', 'sofia.lopez@mail.com', 'abc12345', '987.654.321-11', 'Rua Nova, 45', 'Buenos Aires', 'Buenos Aires', '22222-333', '2025-06-12 16:20:00'),
(5, 'Raj Patel', 'raj.patel@mail.com', 'mypassword', '321.654.987-88', 'Rua Central, 500', 'Mumbai', 'Maharashtra', '33333-444', '2025-05-08 11:15:00'),
(6, 'Anna Müller', 'anna.mueller@mail.de', 'anna2025', '456.789.123-77', 'Bahnhofstrasse 10', 'Berlim', 'Berlin', '44444-555', '2025-04-22 13:45:00'),
(7, 'Carlos Silva', 'carlos.silva@mail.br', 'carlos!@#', '789.123.456-66', 'Av. Brasil, 200', 'São Paulo', 'SP', '55555-666', '2025-03-17 08:30:00'),
(8, 'Fatima Zahra', 'fatima.zahra@mail.ma', 'fatima789', '654.321.987-55', 'Rue Marrakech, 7', 'Marrakech', 'Marrakech', '66666-777', '2025-02-11 10:00:00'),
(9, 'Ivan Petrov', 'ivan.petrov@mail.ru', 'ivanpass', '321.987.654-44', 'Lenina St, 100', 'Moscou', 'Moscou', '77777-888', '2025-01-05 15:00:00'),
(10, 'Lina Kim', 'lina.kim@mail.kr', 'lina2025', '987.321.654-33', 'Seoul St, 55', 'Seul', 'Seul', '88888-999', '2024-12-01 12:00:00');

-- --------------------------------------------------------

--
-- Estrutura para tabela `itempedido`
--

CREATE TABLE `itempedido` (
  `id_itemPedido` int(10) NOT NULL,
  `id_pedido` int(10) NOT NULL,
  `id_produto` int(10) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `precoUnitario` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `itempedido`
--

INSERT INTO `itempedido` (`id_itemPedido`, `id_pedido`, `id_produto`, `quantidade`, `precoUnitario`) VALUES
(11, 11, 1, 1, 1999.99),
(12, 12, 3, 2, 299.99),
(13, 13, 2, 1, 199.99),
(14, 14, 4, 3, 899.5),
(15, 15, 5, 1, 899.5),
(16, 16, 6, 2, 1599.9),
(17, 17, 7, 1, 799.99),
(18, 18, 8, 4, 499),
(19, 19, 9, 1, 1199.99),
(20, 20, 10, 1, 399.9);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(10) NOT NULL,
  `id_cliente` int(10) DEFAULT NULL,
  `dataPedido` datetime NOT NULL,
  `status` text NOT NULL,
  `valorTotal` double NOT NULL,
  `enderecoEntrega` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_cliente`, `dataPedido`, `status`, `valorTotal`, `enderecoEntrega`) VALUES
(11, 1, '2025-09-01 10:00:00', 'Em processamento', 2499.99, 'Rua da Qabba, 1243, Cabul'),
(12, 2, '2025-09-02 14:20:00', 'Enviado', 199.99, 'Rua das Flores, 987, Xangai'),
(13, 3, '2025-09-03 09:30:00', 'Entregue', 5899, 'Av. das Palmeiras, 150, Mascate'),
(14, 4, '2025-09-04 17:45:00', 'Cancelado', 349.9, 'Rua Nova, 45, Buenos Aires'),
(15, 5, '2025-09-05 11:10:00', 'Entregue', 899.5, 'Rua Central, 500, Mumbai'),
(16, 6, '2025-09-06 08:00:00', 'Em processamento', 2799.99, 'Bahnhofstrasse 10, Berlim'),
(17, 7, '2025-09-07 13:25:00', 'Enviado', 1299, 'Av. Brasil, 200, São Paulo'),
(18, 8, '2025-09-08 16:15:00', 'Entregue', 499, 'Rue Marrakech, 7, Marrakech'),
(19, 9, '2025-09-09 10:40:00', 'Em processamento', 1599.9, 'Lenina St, 100, Moscou'),
(20, 10, '2025-09-10 12:50:00', 'Entregue', 399.9, 'Seoul St, 55, Seul');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(10) NOT NULL,
  `nome` text NOT NULL,
  `descricao` text NOT NULL,
  `preco` double NOT NULL,
  `sku` text NOT NULL,
  `estoque` int(10) NOT NULL,
  `dataCriacao` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `nome`, `descricao`, `preco`, `sku`, `estoque`, `dataCriacao`) VALUES
(1, 'Smartphone X1', 'Smartphone com 128GB, 6GB RAM, câmera dupla', 1999.99, 'SPX1-2025', 50, '2025-01-10 10:00:00'),
(2, 'Notebook Pro 15', 'Notebook com processador i7, 16GB RAM, SSD 512GB', 4999.99, 'NBP15-2025', 30, '2025-02-15 14:30:00'),
(3, 'Fone de Ouvido Bluetooth', 'Fone sem fio com cancelamento de ruído', 299.99, 'FOB-2025', 100, '2025-03-01 09:20:00'),
(4, 'Smartwatch S3', 'Relógio inteligente com monitor cardíaco', 899.5, 'SWS3-2025', 75, '2025-04-05 12:00:00'),
(5, 'Tablet T10', 'Tablet com tela de 10\", 64GB, câmera frontal', 1299, 'TBT10-2025', 40, '2025-05-12 11:10:00'),
(6, 'Câmera Digital Z5', 'Câmera profissional com zoom óptico 10x', 1599.9, 'CDZ5-2025', 20, '2025-06-20 16:45:00'),
(7, 'Impressora Laser', 'Impressora monocromática rápida e eficiente', 799.99, 'IL-2025', 15, '2025-07-18 13:25:00'),
(8, 'Roteador Wi-Fi 6', 'Roteador com alta velocidade e cobertura ampla', 499, 'RW6-2025', 60, '2025-08-22 10:55:00'),
(9, 'Monitor 27\"', 'Monitor Full HD com alta taxa de atualização', 1199.99, 'M27-2025', 25, '2025-09-10 09:35:00'),
(10, 'Teclado Mecânico', 'Teclado retroiluminado com switches azuis', 399.9, 'TM-2025', 80, '2025-10-05 14:00:00');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `itempedido`
--
ALTER TABLE `itempedido`
  ADD PRIMARY KEY (`id_itemPedido`),
  ADD KEY `id_pedido` (`id_pedido`),
  ADD KEY `id_produto` (`id_produto`);

--
-- Índices de tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `itempedido`
--
ALTER TABLE `itempedido`
  MODIFY `id_itemPedido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `itempedido`
--
ALTER TABLE `itempedido`
  ADD CONSTRAINT `itempedido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`),
  ADD CONSTRAINT `itempedido_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`);

--
-- Restrições para tabelas `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
