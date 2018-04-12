package behavioral.strategy.filecompressiontool;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {

    public void compressFiles(List<File> files) {
        System.out.println("RAR'ing the Files");
    }
}
