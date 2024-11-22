package com.enum_;

//@SuppressWarnings("unused")
enum EnumExrecise {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");

    private final String name;
    String mmm;
    EnumExrecise(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        EnumExrecise[] weeks = EnumExrecise.values();
        for(EnumExrecise enumExrecise: weeks)
            System.out.println(enumExrecise);

    }
}
