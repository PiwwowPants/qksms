package receiver

import android.content.*
import android.widget.Toast
import com.moez.QKSMS.R

class CopyToClipboardReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val text = intent.getCharSequenceExtra(Intent.EXTRA_TEXT)
        if (text != null) {
            (context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager).primaryClip = ClipData.newPlainText("qksms copy", text)
        } else {
            Toast.makeText(context, context.getString(R.string.copy_status_failed), Toast.LENGTH_SHORT).show()
        }
    }
}