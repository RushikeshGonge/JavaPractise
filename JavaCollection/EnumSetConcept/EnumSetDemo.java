package EnumSetConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {

        //it is not synchronized
        //it is highly performing java collection framework
        //faster than HashSet
        //all the methods are implemented using bitwise arithmetic operations.(that is why it is so fast)

    enum Lang{
        JAVA,
        CSHARP,
        JAVASCRIPT,
        PYTHON,
        RUBY
    }





    public static void main(String[] args) {

        //created a new enumSet using enum
        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
        System.out.println(langs);

        EnumSet<Lang> langs1 = EnumSet.noneOf(Lang.class);
        System.out.println(langs1);

        //range(e1,e2):
        EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA,Lang.JAVASCRIPT);
        System.out.println(enumRange);

        //of:
        EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSHARP);
        System.out.println(CSharpEnum);

        EnumSet<Lang> multipleEnum = EnumSet.of(Lang.CSHARP,Lang.JAVA);
        System.out.println(multipleEnum);

        //add and addAll:
        EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2 = EnumSet.allOf(Lang.class);
        lang2.add(Lang.JAVASCRIPT);

        lang2.addAll(lang1);
        System.out.println(lang2);

        //how to iterate EnumSet: iterator:
        EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);

        Iterator<Lang> it = fullLang.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //remove() and removeAll():
        EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
        System.out.println(newLang);

        boolean b = newLang.remove(Lang.CSHARP);
        System.out.println(b);
        System.out.println(newLang);

        boolean b1 = newLang.removeAll((newLang));
        System.out.println(b1);
        System.out.println(newLang);






    }
}
