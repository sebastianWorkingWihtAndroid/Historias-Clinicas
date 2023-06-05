-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2019 a las 18:07:30
-- Versión del servidor: 10.1.39-MariaDB
-- Versión de PHP: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia`
--

CREATE TABLE `historia` (
  `nhistoria` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `id_medico` int(11) DEFAULT NULL,
  `motivo` varchar(200) DEFAULT NULL,
  `enfactual` varchar(200) DEFAULT NULL,
  `diagnostico` varchar(200) DEFAULT NULL,
  `tratamiento` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historia`
--

INSERT INTO `historia` (`nhistoria`, `fecha`, `id_paciente`, `id_medico`, `motivo`, `enfactual`, `diagnostico`, `tratamiento`) VALUES
(1, '2019-08-14', 1, 101, 'fractura', 'artrosis', 'fractura de tibia', '  antibiótico intravenos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `idmedico` int(11) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `especialidad` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`idmedico`, `nombres`, `apellidos`, `especialidad`) VALUES
(101, 'cristian', 'bru', 'medico general');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(6) NOT NULL,
  `documento` varchar(12) DEFAULT NULL,
  `tipo_doc` varchar(4) DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `fnacimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `documento`, `tipo_doc`, `nombres`, `apellidos`, `sexo`, `fnacimiento`) VALUES
(1, '78024752', 'cc', 'cesar', 'pitalua', 'masculino', '2019-08-14'),
(2, '78024752', 'C.C', 'enrique', 'castro', 'masculino', '2019-08-10'),
(3, '78024764', 'C.C', 'enrique', 'castro', 'masculino', '2019-08-10'),
(4, '78024764', 'C.C', 'daniel', 'castro', 'masculino', '2019-02-10'),
(5, '1064980245', 'T.I', 'Ana ', 'Teran romero', 'femenino', '2001-11-18'),
(7, '7898887', 'C.C', 'luis', 'sdas', 'masculino', '2019-03-03'),
(8, '87498738', 'C.C', 'juan', 'negret', 'masculino', '2019-02-02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usuario` varchar(20) DEFAULT NULL,
  `password` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usuario`, `password`) VALUES
('admin', 123);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `historia`
--
ALTER TABLE `historia`
  ADD PRIMARY KEY (`nhistoria`),
  ADD KEY `id_medico` (`id_medico`),
  ADD KEY `historia_ibfk_1` (`id_paciente`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`idmedico`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
