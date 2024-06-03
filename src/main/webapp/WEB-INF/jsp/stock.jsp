<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Stock</title>
</head>
<body>
    <h1>Stock</h1>

    <!-- Formulario para seleccionar sucursal y categoría de producto -->
    <form id="filtroForm" action="/filtro/stock" method="get">
        <label for="sucursal">Seleccione una sucursal:</label>
        <select name="idSucursal" id="sucursal">
            <option value="">Todas las sucursales</option>
            <c:forEach var="sucursal" items="${sucursales}">
                <option value="${sucursal.idSucursal}">${sucursal.nombre}</option>
            </c:forEach>
        </select>
        <br>

        <label for="categoriaProducto">Seleccione una categoría de producto:</label>
        <select name="idCategoriaProducto" id="categoriaProducto">
            <option value="">Todas las categorías</option>
            <c:forEach var="categoriaProducto" items="${categoriasProducto}">
                <option value="${categoriaProducto.idCategoriaProducto}">${categoriaProducto.nombre}</option>
            </c:forEach>
        </select>
        <br>

        <button type="submit">Filtrar</button>
    </form>

    <!-- Mostrar el stock -->
    <h2>Stock Disponible</h2>
    <table>
        <thead>
            <tr>
                <th>Sucursal</th>
                <th>ID Producto</th>
                <th>Nombre Producto</th>
                <th>Categoría</th>
                <th>Stock</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="stock" items="${stocks}">
                <tr>
                    <td>${stock.idSucursal}</td>
                    <td>${stock.idProducto}</td>
                    <td>${stock.producto.nombreProducto}</td>
                  <td>${stock.categoriaProducto.nombre}</td>
                    <td>${stock.stock}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

