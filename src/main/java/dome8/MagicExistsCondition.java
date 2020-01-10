package dome8;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @className MagicExistsCondition
 * @Descirption 判断Magic存在
 * @Author WengLiangBao
 * @Date 2020/1/8 上午10:22
 * @Vsersion 1.0
 */
public class MagicExistsCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        return env.containsProperty("magic");
    }
}
