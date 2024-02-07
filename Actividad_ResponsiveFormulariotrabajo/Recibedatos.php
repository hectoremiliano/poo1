<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recibir datos del formulario
    $rfc = $_POST["rfc"];
    $primerApellido = $_POST["primer-apellido"];
    $segundoApellido = $_POST["segundo-apellido"];
    $nombres = $_POST["nombres"];
    $fechaNacimiento = $_POST["fecha-nacimiento"];
    $entidadNacimiento = $_POST["entidad-nacimiento"];
    $genero = $_POST["genero"];

    // Datos de ubicación
    $domicilio = $_POST["domicilio"];
    $ciudad = $_POST["ciudad"];
    $estadoResidencia = $_POST["estado-residencia"];
    $codigoPostal = $_POST["codigo-postal"];

    // Datos de evaluación
    $evaluacion1 = $_POST["evaluacion-1"];
    $evaluacion2 = $_POST["evaluacion-2"];
    $evaluacion3 = $_POST["evaluacion-3"];

    // Calcular promedio
    $promedio = number_format(($evaluacion1 + $evaluacion2 + $evaluacion3) / 3, 2);

    // Datos de verificación
    $cuotaPagada = isset($_POST["cuota-pagada"]) ? "Sí" : "No";
    $activo = isset($_POST["activo"]) ? "Sí" : "No";

    // Imprimir datos recibidos
    echo "<h2>Datos recibidos:</h2>";
    echo "<p>RFC: $rfc</p>";
    echo "<p>Primer Apellido: $primerApellido</p>";
    echo "<p>Segundo Apellido: $segundoApellido</p>";
    echo "<p>Nombres: $nombres</p>";
    echo "<p>Fecha de Nacimiento: $fechaNacimiento</p>";
    echo "<p>Entidad de Nacimiento: $entidadNacimiento</p>";
    echo "<p>Género: $genero</p>";

    // Imprimir datos de ubicación
    echo "<h3>Datos de Ubicación:</h3>";
    echo "<p>Domicilio: $domicilio</p>";
    echo "<p>Ciudad: $ciudad</p>";
    echo "<p>Estado de Residencia: $estadoResidencia</p>";
    echo "<p>Código Postal: $codigoPostal</p>";

    // Imprimir datos de evaluación
    echo "<h3>Datos de Evaluación:</h3>";
    echo "<p>Evaluación 1: $evaluacion1</p>";
    echo "<p>Evaluación 2: $evaluacion2</p>";
    echo "<p>Evaluación 3: $evaluacion3</p>";
    echo "<p>Promedio: $promedio</p>";

    // Imprimir datos de verificación
    echo "<h3>Datos de Verificación:</h3>";
    echo "<p>Cuota Pagada: $cuotaPagada</p>";
    echo "<p>Activo: $activo</p>";
} else {
    echo "<p>Error al procesar la solicitud. Método no permitido.</p>";
}
?>