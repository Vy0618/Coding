-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15/09/2025 às 18:48
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
-- Banco de dados: `clinica`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `consulta`
--

CREATE TABLE `consulta` (
  `id` int(11) NOT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `id_medico` int(11) DEFAULT NULL,
  `data_hora` datetime DEFAULT NULL,
  `observacoes` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `consulta`
--

INSERT INTO `consulta` (`id`, `id_paciente`, `id_medico`, `data_hora`, `observacoes`) VALUES
(1, 1, 1, '2025-09-15 12:16:00', 'consulta de rotina'),
(2, 2, 3, '2025-09-16 09:00:00', 'retorno pós-operatório'),
(3, 3, 2, '2025-09-17 14:30:00', 'consulta para avaliação de exames'),
(4, 4, 4, '2025-09-18 11:15:00', 'queixa de dores abdominais'),
(5, 5, 1, '2025-09-19 08:45:00', 'check-up geral'),
(6, 6, 5, '2025-09-20 10:00:00', 'avaliação cardiológica'),
(7, 7, 2, '2025-09-21 15:00:00', 'sintomas gripais'),
(8, 8, 3, '2025-09-22 13:20:00', 'orientações sobre medicação'),
(9, 9, 4, '2025-09-23 16:10:00', 'avaliação dermatológica'),
(10, 8, 3, '2025-09-22 13:20:00', 'orientações sobre medicação'),
(11, 9, 4, '2025-09-23 16:10:00', 'avaliação dermatológica');

-- --------------------------------------------------------

--
-- Estrutura para tabela `medico`
--

CREATE TABLE `medico` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `especialidade` varchar(50) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `crm` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `medico`
--

INSERT INTO `medico` (`id`, `nome`, `especialidade`, `telefone`, `crm`) VALUES
(1, 'Dr. Carlos Souza', 'Cardiologista', '159341343431', 'CRM12345 '),
(2, 'Dr. Mohhamed Souza', 'Pediatra', '154313431', 'CRM12343'),
(3, 'Dr. Noku Tiamo', 'Urologista', '154313431', 'CRM124331'),
(4, 'Dr. Jacinto Pinto', 'Urologista', '15313441', 'CRM32346'),
(5, 'Dr. Takakara Nosaco', 'Oftalmologista', '15887641', 'CRM19343'),
(6, 'Dr. Kosako Moduro', 'Urologista', '154313431', 'CRM9573'),
(7, 'Dr. Raul Guidão', 'Ortopedista', '15431433', 'CRM18463'),
(8, 'Dr. Giulia Nogare', 'Psiquiatra', '150050612', 'CRM85371'),
(9, 'Dr. Felipe Felps', 'Oftalmologista', '159998895', 'CRM14321'),
(10, 'Dr. Pedro Kamaro', 'Pediatra', '154891731', 'CRM98765');

-- --------------------------------------------------------

--
-- Estrutura para tabela `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `data_nascimento` date DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `paciente`
--

INSERT INTO `paciente` (`id`, `nome`, `data_nascimento`, `telefone`, `endereco`, `cep`, `email`) VALUES
(1, 'Maria Fernanda', '1985-09-22', '9876-5678', 'Avenida Paulista, 1000', '01310-100', 'maria.fernanda@yahoo.com'),
(2, 'Carlos Eduardo', '1978-12-04', '9789-1234', 'Rua da Consolação, 543', '01301-000', 'carloseduardo@gmail.com'),
(3, 'Ana Beatriz', '1992-03-15', '9654-3210', 'Rua Oscar Freire, 1234', '05409-011', 'ana.beatriz@hotmail.com'),
(4, 'Fernando Lima', '1980-07-30', '9531-8642', 'Rua Augusta, 789', '01305-000', 'fernando.lima@outlook.com'),
(5, 'Gabriel Rocha', '1995-01-18', '9420-7531', 'Rua Xavier de Toledo, 234', '01018-010', 'gabriel.rocha@gmail.com'),
(6, 'Isabela Marques', '1987-11-25', '9312-6453', 'Rua Pamplona, 1456', '01405-001', 'isabela.marques@yahoo.com'),
(7, 'Rafael Alves', '1976-06-08', '9210-4321', 'Rua Bela Cintra, 765', '01415-000', 'rafael.alves@hotmail.com'),
(8, 'Juliana Barbosa', '1983-04-27', '9123-9876', 'Rua Oscar Freire, 2345', '05409-012', 'juliana.barbosa@gmail.com'),
(9, 'Pedro Henrique', '1998-02-14', '9012-3456', 'Rua Augusta, 1234', '01305-001', 'pedro.henrique@outlook.com'),
(12356, 'Mateo González', '0000-00-00', '32987456', 'Buenos Aires, Argentina', 'C1012', 'mateo.gonzalez95@gmail.com');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_paciente` (`id_paciente`),
  ADD KEY `id_medico` (`id_medico`);

--
-- Índices de tabela `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `consulta`
--
ALTER TABLE `consulta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de tabela `medico`
--
ALTER TABLE `medico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12365;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
