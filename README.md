# TareaHilos

## Caso certificados de estudio 

Para el ejercicio de los hilos planteamos como situación el proceso de solicitud de certificados en Siga, donde un estudiante ingresa, solicita su certificado y sale del sistema. Mientras el usuario sale del sistema, es que el certificado es procesado y despues de un tiempo este es generado.

Para simular esto, se creó la clase Siga la cual implementa runnable para volverla un hilo, en esta se procesa el certificado y también se da el resultado de cuando el certificado se completó exitosamente, está tiene un setTimeOut para simular el proceso de espera del tiempo que toma generar un certificado, si bien, pueden ser semanas, en el sistema está en 20 segundos para simular la demora.

En la clase Main, se inicializa Siga dando una confirmación y se inicia el hilo, despues de iniciar el hilo el usuario sale de Siga pero el hilo continúa trabajando según el timeout establecido y por último da una respuesta indicando que el certificado fue generado.
