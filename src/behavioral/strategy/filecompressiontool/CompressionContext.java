package behavioral.strategy.filecompressiontool;

import java.io.File;
import java.util.List;

public class CompressionContext {

    private CompressionStrategy strategy; // This can be set at runtime by the application preferences

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
