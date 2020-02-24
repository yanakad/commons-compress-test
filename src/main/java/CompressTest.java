import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;

import java.io.InputStream;

/**
 * Created by ykadiysk on 2/24/20.
 */
public class CompressTest {

    public static void main(String[] args) throws Exception{
        CompressTest ct = new CompressTest();
        InputStream tarData = ct.getClass().getResourceAsStream("/test.csv");
        TarArchiveInputStream tis = new TarArchiveInputStream(tarData);
        TarArchiveEntry te = tis.getNextTarEntry();
        System.out.println(te.getName());
        System.out.println(te.isFile());
    }
}
