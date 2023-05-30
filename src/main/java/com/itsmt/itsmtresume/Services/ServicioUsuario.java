/*
 * package Services;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.security.core.userdetails.UserDetails;
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.itsmt.itsmtresume.models.Account;
 * import com.itsmt.itsmtresume.repository.AccountRpository;
 * 
 * @Service
 * public class ServicioUsuario implements UserDetailsService{
 * 
 * @Autowired
 * private AccountRpository cuentaRepository;
 * 
 * @Override
 * public UserDetails loadUserByUsername(String correo) throws
 * UsernameNotFoundException {
 * Account cuenta = cuentaRepository.findByUsername(correo);
 * if (cuenta == null) {
 * throw new UsernameNotFoundException("Usuario no encontrado: " + correo);
 * }
 * return Account.withUsername(cuenta.getCorreo())
 * .password(cuenta.getContraseña())
 * .roles("USER")
 * .build();
 * }
 * 
 * }
 */
