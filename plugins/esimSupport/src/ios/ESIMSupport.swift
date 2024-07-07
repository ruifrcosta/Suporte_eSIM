import CoreTelephony

@objc(ESIMSupport) class ESIMSupport: CDVPlugin {
    @objc(checkESIMSupport:)
    func checkESIMSupport(command: CDVInvokedUrlCommand) {
        var result = false
        if #available(iOS 12.1, *) {
            let provisioning = CTCellularPlanProvisioning()
            result = provisioning.supportsCellularPlan()
        }
        let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAs: result)
        self.commandDelegate.send(pluginResult, callbackId: command.callbackId)
    }
}
