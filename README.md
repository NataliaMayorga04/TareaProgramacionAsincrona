# TareaProgramacionAsincrona

Hilos:

Para el ejercicio de los hilos planteamos como situacion el proceso de solicitud de certificados en Siga, donde un estudiante ingresa, solicita su certificado y sale del sistema. Mientras el usuario sale del sistema es que el certificado es procesado y despues de un tiempo este es generado.

Para simular esto se creo la clase Siga la cual implementa runnable para volverla un hilo, en esta se procesa el certificado y tambien se da el resultado de cuando el certificado se completo exitosamente, esta tiene un setTimeOut para simular el proceso de espera del tiempo que toma generar un certificado, si bien pueden ser semanas en el sistema esta en 20 segundos para simular la demora.

En la clase Main se inicializa siga dando una confirmacion y se inicia el hilo, despues de iniciar el hilo el usuario sale de Siga pero el hilo continua trabajando segun el timeout establecido y por ultimo da una respuesta indicando que el certificado fue generado.
