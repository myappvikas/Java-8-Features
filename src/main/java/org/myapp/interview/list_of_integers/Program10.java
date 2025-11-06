package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

public class Program10 {

    private static final Logger log = LoggerFactory.getLogger(Program10.class);

    public static void main(String[] args) {

        List<String> list = Stream
                .of("sssss", "ssss", "sss", "ss", "s", "aaaaa")
                .filter(e -> e.startsWith("s"))
                .toList();
        log.info("Filtered list: {}", list);
    }
}
