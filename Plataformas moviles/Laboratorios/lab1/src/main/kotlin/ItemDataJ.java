public class ItemDataJ {
    private final Object originalValue;
    private String resultado;

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public String getType() {
        if (this.originalValue == null) {
            return null;
        }
        if (this.originalValue instanceof String) {
            resultado = "cadena";
        } else if (this.originalValue instanceof Integer) {
            resultado = "entero";
        } else if (this.originalValue instanceof Boolean) {
            resultado = "booleano";
        } else {
            resultado = null;
        }

        return resultado;
    }

    public String getInfo() {
        resultado = getType();
        if (resultado == null) {
            return null;
        }
        switch (resultado) {
            case "cadena":
                return "L" + this.originalValue.toString().length();
            case "entero":
                Integer numero = Integer.parseInt(this.originalValue.toString());
                if (numero % 10 == 0) {
                    return "M10";
                } else if (numero % 5 == 0) {
                    return "M5";
                } else if (numero % 2 == 0) {
                    return "M2";
                } else {
                    return null;
                }
            case "booleano":
                if((boolean) this.originalValue){
                    return "Verdadero";
                }else{
                    return "Falso";
                }
            default:
                return null;
        }
    }
}

