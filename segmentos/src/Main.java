import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "	Sabonete	",
                "	Kit	",
                "	Colônia	",
                "	Desinfetante	",
                "	Talco	",
                "	Creme para escovar	",
                "	Sanitário	",
                "	Limpador	",
                "	Loção	",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   ",
                "   1   "
                
        );

        final String pai = "37E956573DE720F3C92D6A6BAC8C9C95";
        final String departamento = "Pet Shop/Maquinário";
        final String grupo = "PET_SHOP_MAQUINARIO";

        strings
                .forEach(name -> {
                    //System.out.println(String.format("('%s', null, 0, '%s', '%s/%s', false, true, '%s', '%s'),", UUIDUtil.generate(),name.trim(), departamento.trim(), name.trim(), grupo.trim(), pai));
                    System.out.println(String.format("('%s'),", UUIDUtil.generate(),name.trim()));
                });
//        for (int i = 0; i < 30; i++) {
//            System.out.println(UUIDUtil.generate());
//        }
    }
}