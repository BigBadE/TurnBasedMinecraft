package software.bigbade.turnbasedminecraft.utils;

import com.sun.istack.internal.NotNull;

import javax.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionManager {
    @Nullable
    public static Object callMethod(@NotNull Class<?> clazz, @NotNull String name, @Nullable Object instance, @Nullable Object... args) {
        Method method = getMethod(clazz, name, args);
        method.setAccessible(true);
        try {
            return method.invoke(instance, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @NotNull
    public static Method getMethod(@NotNull Class<?> clazz, @NotNull String name, @Nullable Object... args) {
        Class<?>[] classes = null;
        if(args != null) {
            classes = new Class[args.length];
            for (int i = 0; i < args.length; i++)
                classes[i] = args[i].getClass();
        }
        try {
            return clazz.getDeclaredMethod(name, classes);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
