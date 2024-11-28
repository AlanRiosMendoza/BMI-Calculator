# Define la imagen base de Java
FROM openjdk:latest
# Copia los archivos compilados al contenedor
COPY . .
# Compila los archivos Java
RUN javac *.java
# Expone el puerto utilizado por RMI
EXPOSE 1099
# Inicia el servidor RMI al ejecutar el contenedor
CMD ["java", "ServidorRMI"]