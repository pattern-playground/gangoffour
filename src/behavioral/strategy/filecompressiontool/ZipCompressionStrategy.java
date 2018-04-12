package behavioral.strategy.filecompressiontool;

import java.io.File;
import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy {

    public void compressFiles(List<File> files) {
        System.out.println("Zipping the Files");
    }
}