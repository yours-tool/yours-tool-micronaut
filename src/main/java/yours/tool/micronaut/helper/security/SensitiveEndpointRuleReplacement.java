//package yours.tool.micronaut.helper.security;
//
//import io.micronaut.context.annotation.Replaces;
//import io.micronaut.core.annotation.NonNull;
//import io.micronaut.http.HttpRequest;
//import io.micronaut.inject.ExecutableMethod;
//import io.micronaut.management.endpoint.EndpointSensitivityProcessor;
//import io.micronaut.security.authentication.Authentication;
//import io.micronaut.security.rules.SecurityRuleResult;
//import io.micronaut.security.rules.SensitiveEndpointRule;
//import io.micronaut.security.token.RolesFinder;
//import jakarta.inject.Singleton;
//import org.reactivestreams.Publisher;
//import reactor.core.publisher.Mono;
//
//import java.util.Collections;
//
///**
// * @description:
// * @author：wbh
// * @data 2023/2/6 14:24
// * @version: v1.0
// **/
//@Replaces(SensitiveEndpointRule.class)
//@Singleton
//public class SensitiveEndpointRuleReplacement extends SensitiveEndpointRule {
//
//    private final RolesFinder rolesFinder;
//
//    public SensitiveEndpointRuleReplacement(EndpointSensitivityProcessor endpointSensitivityProcessor,
//                                            RolesFinder rolesFinder) {
//        super(endpointSensitivityProcessor);
//        this.rolesFinder = rolesFinder;
//    }
//
//    @Override
//    @NonNull
//    protected Publisher<SecurityRuleResult> checkSensitiveAuthenticated(@NonNull HttpRequest<?> request,
//                                                                        @NonNull Authentication authentication,
//                                                                        @NonNull ExecutableMethod<?, ?> method) {
//        return Mono.just(rolesFinder.hasAnyRequiredRoles(Collections.singletonList("ROLE_SYSTEM"), authentication.getRoles())
//                ? SecurityRuleResult.ALLOWED : SecurityRuleResult.REJECTED);
//    }
//}
