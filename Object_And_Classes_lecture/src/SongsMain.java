import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsMain {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(term.nextLine());

        List<Song> information = new ArrayList<>();



        for (int i = 0; i < numberOfSongs; i++) {
            String[] data = term.nextLine().split("_");
            String typeList = data[0];
            String songName = data[1];
            String songTime = data[2];

            Song song = new Song(typeList, songName, songTime);

            information.add(song);
        }

        String command = term.nextLine();

        for (Song song : information) {
            if (command.equals(song.getListType())){
                System.out.println(song.getSongName());
            } else if (command.equals("all")){
                System.out.println(song.getSongName());
            }
        }
    }
}
