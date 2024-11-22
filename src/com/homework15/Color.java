package com.homework15;

enum Color implements ColorShow{
    red(255,0,0),
    blue(0,0,255),
    black(0,0,0),
    yellow(255,255,0),
    green(0,255,0)
    ;

    private int redValue;
    private int grenValue;
    private int blueValue;

    Color(int redValue, int grenValue, int blueValue) {
        this.redValue = redValue;
        this.grenValue = grenValue;
        this.blueValue = blueValue;
    }
    @Override
    public void show(){}

}
interface ColorShow{
    public void show();
}