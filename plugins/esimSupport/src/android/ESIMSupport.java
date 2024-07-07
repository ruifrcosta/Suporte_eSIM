import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.telephony.SubscriptionManager;
import android.content.Context;

public class ESIMSupport extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkESIMSupport")) {
            this.checkESIMSupport(callbackContext);
            return true;
        }
        return false;
    }

    private void checkESIMSupport(CallbackContext callbackContext) {
        SubscriptionManager subscriptionManager = (SubscriptionManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE);
        boolean result = subscriptionManager != null && subscriptionManager.canManageSubscription();
        callbackContext.success(result ? 1 : 0);
    }
}
