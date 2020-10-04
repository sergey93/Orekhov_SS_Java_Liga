package com.bad.code2;

public class Square {

    /**
     * координаты центра фигуры
     */
    private Double x, y;

    /**
     * длина ребра квадрата
     */
    private Double edgeSize;

    /**
     * Коструктор класса
     *
     * @param centerX координатам центра фигуры по оси X
     * @param centerY координатам центра фигуры по оси Y
     * @param edgeSize длина стороны квадрата
     */
    public Square(Double centerX, Double centerY, Double edgeSize) {
        this.x = centerX;
        this.y = centerY;
        this.edgeSize = edgeSize;
    }

    /**
     * возвращает координату центра фигуры по оси X
     *
     * @return
     */
    public Double getX() {
        return x;
    }

    /**
     * возвращает координату центра фигуры по оси Y
     *
     * @return
     */
    public Double getY() {
        return y;
    }

    /**
     * возвращает периметр квадрата
     *
     * @return
     */
    public Double getPerimeter() {
        return 4 * edgeSize;
    }
}
