package bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BufferReaderResearch {
    static List<String> list = new ArrayList();
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "D:\\Projects\\Technology Research\\Java\\src\\com\\companyname\\bufferReader\\期货购买计划-大跌-验证.xlsx"))) {
            Stream<String> stream = br.lines();
            list = stream.collect(Collectors.toList());
        }
    }
}
