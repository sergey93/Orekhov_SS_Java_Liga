package com.bad.code2;

/**
 * Класс, описывающий куб
 */
public class Qube implements Shape3D {

    /**
     * координата центра фигуры по оси X
     */
    private final Double x;

    /**
     * координата центра фигуры по оси Y
     */
    private final Double y;

    /**
     * координата центра фигуры по оси Z
     */
    private final Double z;

    /**
     * длина стороны
     */
    private final Double edgeSize;

    /**
     * Конструктор класса
     *
     * @param centerX координата центра по оси X
     * @param centerY координата центра по оси Y
     * @param centerZ координата центра по оси Z
     * @param edgeSize длина стороны
     */
    public Qube(Double centerX, Double centerY, Double centerZ, Double edgeSize) {
        this.x = centerX;
        this.y = centerY;
        this.z = centerZ;
        this.edgeSize = edgeSize;
    }

    /**
     * метод возвращает координату центра по оси Х
     *
     * @return
     */
    @Override
    public Double getX() {
        return x;
    }

    /**
     * метод возвращает координату центра по оси Y
     *
     * @return
     */
    @Override
    public Double getY() {
        return y;
    }

    /**
     * метод возвращает координату центра по оси Z
     *
     * @return
     */
    @Override
    public Double getZ() {
        return z;
    }

    /**
     * метод возвращает объем фигуры
     * 
     * @return
     */
    @Override
    public Double getVolume() {
        return Math.pow(edgeSize, 3);
    }
}
