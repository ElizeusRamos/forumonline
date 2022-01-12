package br.com.pegasus.forum.model;

public enum StatusAtividadeEnum {
    ATIVO("ATIVO"),
    INATIVO("INATIVO");

    private final String value;

    StatusAtividadeEnum(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public static StatusAtividadeEnum fromValue(String text) {
        for (StatusAtividadeEnum b : StatusAtividadeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
