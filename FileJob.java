import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class FileJob {



    List<String> readToys(String filepath) {
        try {
            return Files.readAllLines(Paths.get( filepath));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }




    void writeToys(String mapState){
        try{
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("./toys_after.txt"), StandardCharsets.UTF_8 ));

            bw.write(mapState);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public static BufferedWriter lotteryLog() throws IOException{
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("./lottery_winners.txt", true), StandardCharsets.UTF_8)
        );
        bw.write(LocalDateTime.now().toString()+"\n");
    return bw;
    }
}
