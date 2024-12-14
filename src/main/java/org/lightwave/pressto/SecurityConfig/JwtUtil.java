//package SecurityConfig;
//
//import io.jsonwebtoken.JwtException;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Component;
//
//import java.security.Key;
//import java.util.Date;
//
//@Component
//public class JwtUtil {
//
//    private final Key key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS512);
//    private final int jwtExpirationInMs = 3600000;
//
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationInMs))
//                .signWith(key)
//                .compact();
//    }
//
//    public String getUsernameFromToken(String token) {
//        return Jwts.parserBuilder()
//                .setSigningKey(key)
//                .build()
//                .parseClaimsJws(token)
//                .getBody()
//                .getSubject();
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parserBuilder()
//                    .setSigningKey(key)
//                    .build()
//                    .parseClaimsJws(token);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
