package LevelTest;

public enum level {
    HIGH(1){
        @Override
        public String lowercase() {
            return HIGH.toString().toLowerCase();
        }
    },
    MEDIUM(2){
        @Override
        public String lowercase(){
            return MEDIUM.toString().toLowerCase();
        }
    },
    LOW(3){
        @Override
        public String lowercase(){
            return LOW.toString().toLowerCase();
        }
    };

    private final int levelCode;

    private level(int levelCode){
        this.levelCode = levelCode;
    }
    public int getLevelCode(){
        return this.levelCode;
    }

    public abstract String lowercase();
}
