package AInOut;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathNew {
    public static void main(String[] args) {
        Path path = Paths.get("/home/ALU1W/Descargas");
        try (Stream<Path> stream = Files.walk(path,2);) {
            //List<Path> paths = stream.filter(path1 -> Files.isRegularFile(path1)).collect(Collectors.toList());
            //paths.forEach(path1 -> System.out.println(path1));

            //stream.filter(Files::isDirectory).forEach(System.out::println);

            //stream.filter(Files::isRegularFile).filter(path1 -> path1.getFileName().toString().equals("papelerareciclaje.sh")).forEach(System.out::println);

            Path path1 = Paths.get("/home/ALU1W/Descargas").normalize();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
