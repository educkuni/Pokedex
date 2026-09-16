import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private int height;
    private int weight;
    private List<TypeSlot> types;
    private List<StatSlot> stats;

    private static class TypeSlot {
        private TypeInfo type;
    }

    private static class TypeInfo {
        private String name;
    }

    private static class StatSlot {
        private int base_stat;
        private StatInfo stat;
    }

    private static class StatInfo {
        private String name;
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public double getHeightInMeters() {
        return height / 10.0;
    }

    public double getWeightInKg() {
        return weight / 10.0;
    }

    public String getFormattedTypes() {
        if (types == null || types.isEmpty()) {
            return "Unknown";
        }

        StringBuilder typeList = new StringBuilder();
        for (int i = 0; i < types.size(); i++) {
            String typeName = types.get(i).type.name;
            String capitalized = typeName.substring(0, 1).toUpperCase() + typeName.substring(1);

            typeList.append(capitalized);
            if (i < types.size() - 1) {
                typeList.append(", ");
            }
        }
        return typeList.toString();
    }
    public int getStatValue(String statName) {
        if (stats == null) return 0;

        for (StatSlot statSlot : stats) {
            if (statSlot.stat.name.equalsIgnoreCase(statName)) {
                return statSlot.base_stat;
            }
        }
        return 0;
    }
}


