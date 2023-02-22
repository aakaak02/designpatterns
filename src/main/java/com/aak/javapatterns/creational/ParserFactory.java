package com.aak.javapatterns.creational;

public class ParserFactory {

    public static final String BofA  = "BA";
    public static final String Chase  = "JPMC";
    public static final String Wells  = "WFC";

    public Parser process( String bankname) {
        Parser parser = getParser(bankname);
        parser.parse();
        return parser;
    }

    public Parser getParser (String bankname){
        if (bankname != null && !bankname.isEmpty()) {
            if (bankname.equalsIgnoreCase(BofA)) {
                return new BofAParser();
            } else if (bankname.equalsIgnoreCase(Chase)) {
                return new JPMCParser();
            } else if (bankname.equalsIgnoreCase(Wells)) {
                return new WFCParser();
            }
        }
        return null;
    }
}
