package br.com.pegasus.forum.model;

public enum StatusPerguntaEnum {
    RESPONDIDA("RESPONDIDA"),
    EM_ABERTO("EM_ABERTO");

    private final String value;

    StatusPerguntaEnum(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public static StatusPerguntaEnum fromValue(String text) {
        for (StatusPerguntaEnum b : StatusPerguntaEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
