﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.18052
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace moduloRastreadorWCF.MonitorServiceReference {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="MonitorServiceReference.IMonitorService")]
    public interface IMonitorService {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMonitorService/inserirFila", ReplyAction="http://tempuri.org/IMonitorService/inserirFilaResponse")]
        void inserirFila(string mensagem);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMonitorService/inserirFila", ReplyAction="http://tempuri.org/IMonitorService/inserirFilaResponse")]
        System.Threading.Tasks.Task inserirFilaAsync(string mensagem);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMonitorService/lerProximaMensagem", ReplyAction="http://tempuri.org/IMonitorService/lerProximaMensagemResponse")]
        string lerProximaMensagem();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMonitorService/lerProximaMensagem", ReplyAction="http://tempuri.org/IMonitorService/lerProximaMensagemResponse")]
        System.Threading.Tasks.Task<string> lerProximaMensagemAsync();
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IMonitorServiceChannel : moduloRastreadorWCF.MonitorServiceReference.IMonitorService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class MonitorServiceClient : System.ServiceModel.ClientBase<moduloRastreadorWCF.MonitorServiceReference.IMonitorService>, moduloRastreadorWCF.MonitorServiceReference.IMonitorService {
        
        public MonitorServiceClient() {
        }
        
        public MonitorServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public MonitorServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public MonitorServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public MonitorServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public void inserirFila(string mensagem) {
            base.Channel.inserirFila(mensagem);
        }
        
        public System.Threading.Tasks.Task inserirFilaAsync(string mensagem) {
            return base.Channel.inserirFilaAsync(mensagem);
        }
        
        public string lerProximaMensagem() {
            return base.Channel.lerProximaMensagem();
        }
        
        public System.Threading.Tasks.Task<string> lerProximaMensagemAsync() {
            return base.Channel.lerProximaMensagemAsync();
        }
    }
}
