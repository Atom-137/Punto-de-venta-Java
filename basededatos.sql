-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-01-2021 a las 01:27:05
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectojava`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idcategoria` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idcategoria`, `nombre`, `descripcion`) VALUES
(1, 'Herramientas', 'herramientas'),
(2, 'Carpinteria', 'herramientas para carpinteria'),
(3, 'Desarmadores', 'Desarmadores de todo tipo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `nit` varchar(45) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nombre`, `apellido`, `nit`, `direccion`, `telefono`) VALUES
(1, 'Juan', 'Perez', '455674897', 'Zona 15', '56468798'),
(2, 'JJdfasd', 'sadfsad', '65465496', 'adfasdf', '9874987498'),
(3, 'Cliente 12', '35435', '354354', 'dsafasdfasdf', '132'),
(4, 'asdfasdf', 'asdfasd', 'adsfasdf', 'dsfsad', 'sadfasdf'),
(6, 'Consumidor ', 'Final', '0', 'Ciudad', '123456'),
(7, 'Jhon ', 'Wick', '123456789', 'Zona 15', '4567897');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefactura`
--

CREATE TABLE `detallefactura` (
  `producto_idproducto` int(11) NOT NULL,
  `factura_idfactura` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detallefactura`
--

INSERT INTO `detallefactura` (`producto_idproducto`, `factura_idfactura`, `cantidad`, `precio`, `total`) VALUES
(1, 21, 2, 15, 30),
(1, 22, 3, 15, 45),
(1, 23, 5, 15, 75),
(2, 21, 2, 35, 70),
(2, 22, 3, 35, 105),
(2, 23, 7, 35, 245),
(7, 21, 2, 75, 150),
(7, 22, 9, 75, 675),
(7, 23, 14, 75, 1050);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idfactura` int(11) NOT NULL,
  `fecha` varchar(45) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `iva` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `usuario_idusuario` int(11) NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `metodopago_idmetodopago` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idfactura`, `fecha`, `subtotal`, `iva`, `total`, `usuario_idusuario`, `cliente_idcliente`, `metodopago_idmetodopago`) VALUES
(2, '29/ 11/ 2020', 380, 46, 426, 1, 6, 2),
(4, '29/ 11/ 2020', 3255, 391, 3646, 1, 6, 2),
(6, '30/ 11/ 2020', 30, 4, 34, 1, 6, 2),
(7, '30/ 11/ 2020', 560, 67, 627, 1, 6, 2),
(8, '30/ 11/ 2020', 770, 92, 862, 1, 6, 1),
(9, '30/ 11/ 2020', 13905, 1669, 15574, 1, 6, 6),
(10, '30/ 11/ 2020', 915, 110, 1025, 1, 6, 2),
(11, '30/ 11/ 2020', 65, 8, 73, 1, 6, 6),
(12, '30/ 11/ 2020', 0, 0, 0, 1, 6, 2),
(14, '30/ 11/ 2020', 100, 12, 112, 1, 6, 2),
(15, '30/ 11/ 2020', 6090, 731, 6821, 1, 6, 6),
(16, '30/ 11/ 2020', 100, 12, 112, 1, 6, 2),
(17, '30/ 11/ 2020', 600, 72, 672, 1, 6, 2),
(18, '30/ 11/ 2020', 0, 0, 0, 1, 6, 1),
(19, '30/ 11/ 2020', 255, 31, 286, 1, 6, 1),
(20, '30/ 11/ 2020', 180, 22, 202, 1, 6, 2),
(21, '30/ 11/ 2020', 250, 30, 280, 1, 6, 2),
(22, '30/ 11/ 2020', 825, 99, 924, 1, 7, 6),
(23, '30/ 11/ 2020', 1370, 164, 1534, 1, 7, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metodopago`
--

CREATE TABLE `metodopago` (
  `idmetodopago` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `metodopago`
--

INSERT INTO `metodopago` (`idmetodopago`, `nombre`, `descripcion`) VALUES
(1, 'Cheque', 'Pago con cheque'),
(2, 'Efectivo', 'Pago con efectivo'),
(6, 'Tarjeta de crédito', 'Pago con tarjeta de credito');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `preciocosto` varchar(45) NOT NULL,
  `precioventa` varchar(45) NOT NULL,
  `existencia` varchar(45) NOT NULL,
  `categoria_idcategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `descripcion`, `preciocosto`, `precioventa`, `existencia`, `categoria_idcategoria`) VALUES
(1, 'MARTILLO', 'Martillo para clavos', '5.0', '15.0', '564', 3),
(2, 'Desarmador', 'Desarmador estrella de 3 pulgadas', '17.0', '35.0', '45', 1),
(7, 'Matrillo de 3/4\"', 'Martillo de 3/4 de pulgada', '15.0', '75.0', '100', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idproveedor` int(11) NOT NULL,
  `nombreempresa` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `nit` varchar(45) NOT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `vendedor` varchar(45) NOT NULL,
  `telefonovendedor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idproveedor`, `nombreempresa`, `direccion`, `nit`, `telefono`, `descripcion`, `vendedor`, `telefonovendedor`) VALUES
(1, 'cemaco', 'quetzaltenango', '1234567', '44556677', 'Proveedor productos guatemala', 'Luis Hernandez', '45784512'),
(3, 'Truper centroamerica', 'centroamerica', '12345', '456456', 'dafasdfasdfasd', 'Juan Perez', '564654a'),
(4, 'Truper AMERCIA', 'AMERICA', '13549878', '6468798', 'Descripcion empresa adfasdf', 'Juan Perez', '654654'),
(5, 'CELCO', 'Quetzaltenango', '465786897', '45784561', 'Empresa de pinturas', 'Angle', '45678979');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idrol` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`idrol`, `nombre`, `descripcion`) VALUES
(1, 'administrador', 'admin'),
(2, 'cajero', 'cajero1'),
(5, 'Vendedor', 'vendedor al por menor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `cargo` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  `correoelectronico` varchar(45) DEFAULT NULL,
  `cui` varchar(45) DEFAULT NULL,
  `rol_idrol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nombre`, `apellido`, `direccion`, `telefono`, `cargo`, `usuario`, `contrasenia`, `correoelectronico`, `cui`, `rol_idrol`) VALUES
(1, 'Jhon', 'Wick', 'Calle C', '45784512', 'Administrador', 'admin', 'abc123456', 'fasdfasdfadsf@gmail.com', '12345674897987', 1),
(3, 'Juan', 'Perez', 'Calle C', '5454654', 'administrador ', 'fasdfas', '1234564', 'adfadsf@gmail.com', '65469879874', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idcategoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD PRIMARY KEY (`producto_idproducto`,`factura_idfactura`),
  ADD KEY `fk_producto_has_factura_factura1_idx` (`factura_idfactura`),
  ADD KEY `fk_producto_has_factura_producto1_idx` (`producto_idproducto`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idfactura`),
  ADD KEY `fk_factura_usuario1_idx` (`usuario_idusuario`),
  ADD KEY `fk_factura_cliente1_idx` (`cliente_idcliente`),
  ADD KEY `fk_factura_metodopago1_idx` (`metodopago_idmetodopago`);

--
-- Indices de la tabla `metodopago`
--
ALTER TABLE `metodopago`
  ADD PRIMARY KEY (`idmetodopago`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`),
  ADD KEY `fk_producto_categoria_idx` (`categoria_idcategoria`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idproveedor`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idrol`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`),
  ADD KEY `fk_usuario_rol1_idx` (`rol_idrol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idcategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idfactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `metodopago`
--
ALTER TABLE `metodopago`
  MODIFY `idmetodopago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idproveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idrol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD CONSTRAINT `fk_producto_has_factura_factura1` FOREIGN KEY (`factura_idfactura`) REFERENCES `factura` (`idfactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_producto_has_factura_producto1` FOREIGN KEY (`producto_idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `fk_factura_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_factura_metodopago1` FOREIGN KEY (`metodopago_idmetodopago`) REFERENCES `metodopago` (`idmetodopago`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_factura_usuario1` FOREIGN KEY (`usuario_idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_producto_categoria` FOREIGN KEY (`categoria_idcategoria`) REFERENCES `categoria` (`idcategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_rol1` FOREIGN KEY (`rol_idrol`) REFERENCES `rol` (`idrol`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
