# RelationalMappingDemo



  String str = "hello hello voilates foreign key constraints \"amol_jadkarr\"";
        // String str1 = str.s
        System.out.println( str.indexOf("voilates foreign key constraints"));
        int index = str.indexOf("voilates foreign key constraints")+new String("voilates foreign key constraints").length() + 2;
        // System.out.println(str.charAt(str.indexOf("voilates foreign key constraints")+new String("voilates foreign key constraints").length() + 2));
        int secondIndex = str.indexOf("\"", index);
        String sub = str.substring(index, secondIndex);
        System.out.println(sub);
