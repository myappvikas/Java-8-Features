package org.myapp.string.reverse;

/*
If the String is to long then StringBuilder is better, because String
is immutable and, it will create multiple objects in SCP area.
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeOrder {

    private static final Logger log = LoggerFactory.getLogger(ChangeOrder.class);

    public static void main(String[] args) {

        String str = "vikas kumar gupta";
        String[] strings = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            reversed.append(strings[i]).append(" ");
        }
        log.info(reversed.toString());
    }
}
