public class EmpleadoBR {
    private static float salariBase;

    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra) {
        if (tipus == null) {
            return -1;
        } else if (tipus.name().equalsIgnoreCase("venedor")) {
            salariBase = 1000;
        } else if (tipus.name().equalsIgnoreCase("encarregat")) {
            salariBase = 1500;
        }
            if(ventasMes >= 1500) {
                salariBase += 200;
            } else if (ventasMes >= 1000) {
                salariBase += 100;
            } else if (ventasMes < 0) {
                return -1;
            }
            if (horasExtra > 0) {
                salariBase += 20 * horasExtra;
            } else if (horasExtra < 0) {
                return -1;
            }
        return salariBase;
    }

    public static float calculaSalarioNeto(float salarioBruto) {
        float retencion = 0;
        if (salarioBruto >= 1000 && salarioBruto < 1500) {
            retencion = 16;
        } else if (salarioBruto >= 1500) {
            retencion = 18;
        } else if (salarioBruto < 0) {
            return -1;
        } else {
            return salarioBruto;
        }
        return salarioBruto * (1 - (retencion / 100));
    }
}
