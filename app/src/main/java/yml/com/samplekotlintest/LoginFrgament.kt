package yml.com.samplekotlintest


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class LoginFrgament : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_frgament, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       /* btnGoToHome.setOnClickListener {
            val homeActivity = Intent(context, HomeActivity::class.java)
            startActivity(homeActivity)
       */     /*val deepLinkBuilder = NavDeepLinkBuilder(this!!.context!!).setGraph(R.navigation.nav_home).setComponentName(HomeActivity::class.java).setDestination(R.id.homeFragment).createPendingIntent();

            findNavController().createDeepLink().setDestination(R.id.homeFragment).createPendingIntent().send(context,0,homeActivity)*/
        }

}
