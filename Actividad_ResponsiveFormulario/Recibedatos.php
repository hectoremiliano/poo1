<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'PHPMailer/Exception.php';
require 'PHPMailer/PHPMailer.php';
require 'PHPMailer/SMTP.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recibir los datos del formulario
    $datos = $_POST;

    // Imprimir los datos en la pantalla
    echo "<pre>";
    print_r($datos);
    echo "</pre>";

    // Guardar los datos en un archivo de texto
    guardarDatosEnArchivo($datos);

    // Configurar PHPMailer
    $mail = new PHPMailer(true);

    try {
        // Configuración del servidor de correo
        $mail->isSMTP();
        $mail->Host = 'smtp.tudominio.com';
        $mail->SMTPAuth = true;
        $mail->Username = 'tu@correo.com';
        $mail->Password = 'tu_contraseña';
        $mail->SMTPSecure = 'tls';
        $mail->Port = 587;

        // Configuración del correo
        $mail->setFrom('tu@correo.com', 'Nombre Remitente');
        $mail->addAddress('destino@correo.com', 'Nombre Destinatario');

        $mail->isHTML(true);
        $mail->Subject = 'Datos del formulario';
        $mail->Body = '<pre>' . print_r($datos, true) . '</pre>';

        $mail->send();
        echo 'Correo enviado con éxito';
    } catch (Exception $e) {
        echo 'Error al enviar el correo: ', $mail->ErrorInfo;
    }

    // Redireccionar a una página de agradecimiento o cualquier otra acción que desees
    header("Location: gracias.html");
    exit();
}

function guardarDatosEnArchivo($datos) {
    $archivo = 'datos_formulario.txt';
    $contenido = date('Y-m-d H:i:s') . "\n" . print_r($datos, true) . "\n\n";

    // Guardar datos en el archivo
    file_put_contents($archivo, $contenido, FILE_APPEND | LOCK_EX);
}
?>