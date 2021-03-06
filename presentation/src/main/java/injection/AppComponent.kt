/*
 * Copyright (C) 2017 Moez Bhatti <moez.bhatti@gmail.com>
 *
 * This file is part of QKSMS.
 *
 * QKSMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * QKSMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with QKSMS.  If not, see <http://www.gnu.org/licenses/>.
 */
package injection

import common.QKApplication
import common.QkDialog
import common.util.ContactImageLoader
import common.widget.AvatarView
import common.widget.PagerTitleView
import common.widget.PreferenceView
import common.widget.QkEditText
import common.widget.QkSwitch
import common.widget.QkTextView
import common.widget.Separator
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import feature.compose.DetailedChipView
import feature.widget.WidgetAdapter
import feature.widget.WidgetProvider
import receiver.DefaultSmsChangedReceiver
import receiver.MarkReadReceiver
import receiver.MarkSeenReceiver
import receiver.MmsReceivedReceiver
import receiver.MmsSentReceiver
import receiver.MmsUpdatedReceiver
import receiver.NightModeReceiver
import receiver.RemoteMessagingReceiver
import receiver.SendSmsReceiver
import receiver.SmsDeliveredReceiver
import receiver.SmsProviderChangedReceiver
import receiver.SmsReceiver
import receiver.SmsSentReceiver
import service.HeadlessSmsSendService
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, BuildersModule::class])
interface AppComponent {

    fun inject(application: QKApplication)

    fun inject(dialog: QkDialog)

    fun inject(fetcher: ContactImageLoader.ContactImageFetcher)

    fun inject(receiver: DefaultSmsChangedReceiver)
    fun inject(receiver: SmsDeliveredReceiver)
    fun inject(receiver: SmsSentReceiver)
    fun inject(receiver: MarkSeenReceiver)
    fun inject(receiver: MarkReadReceiver)
    fun inject(receiver: MmsReceivedReceiver)
    fun inject(receiver: MmsSentReceiver)
    fun inject(receiver: MmsUpdatedReceiver)
    fun inject(receiver: NightModeReceiver)
    fun inject(receiver: RemoteMessagingReceiver)
    fun inject(receiver: SendSmsReceiver)
    fun inject(receiver: SmsProviderChangedReceiver)
    fun inject(receiver: SmsReceiver)
    fun inject(receiver: WidgetProvider)

    fun inject(service: HeadlessSmsSendService)
    fun inject(service: WidgetAdapter)

    fun inject(view: AvatarView)
    fun inject(view: DetailedChipView)
    fun inject(view: PagerTitleView)
    fun inject(view: PreferenceView)
    fun inject(view: QkEditText)
    fun inject(view: QkSwitch)
    fun inject(view: QkTextView)
    fun inject(view: Separator)

}