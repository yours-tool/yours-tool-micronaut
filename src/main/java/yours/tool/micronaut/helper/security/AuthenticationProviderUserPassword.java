//package yours.tool.micronaut.helper.security;
//
//import io.micronaut.http.HttpRequest;
//import io.micronaut.security.authentication.AuthenticationProvider;
//import io.micronaut.security.authentication.AuthenticationRequest;
//import io.micronaut.security.authentication.AuthenticationResponse;
//import jakarta.inject.Singleton;
//import org.reactivestreams.Publisher;
//import reactor.core.publisher.Mono;
//
///**
// * @description:
// * @author：wbh
// * @data 2023/2/6 14:08
// * @version: v1.0
// **/
//@Singleton
//public class AuthenticationProviderUserPassword implements AuthenticationProvider {
//
//
//    @Override
//    public Publisher<AuthenticationResponse> authenticate(HttpRequest<?> httpRequest, AuthenticationRequest<?, ?> authenticationRequest) {
//        return Flowable.create(emitter -> {
//            if (authenticationRequest.getIdentity().equals("sherlock") &&
//                    authenticationRequest.getSecret().equals("password")) {
//                emitter.onNext(new UserDetails((String) authenticationRequest.getIdentity(), new ArrayList<>()));
//                emitter.onComplete();
//            } else {
//                emitter.onError(new AuthenticationException(new AuthenticationFailed()));
//            }
//        }, BackpressureStrategy.ERROR);
//    }
//}
